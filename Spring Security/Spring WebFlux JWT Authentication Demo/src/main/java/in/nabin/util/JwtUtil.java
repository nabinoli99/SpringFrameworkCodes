package in.nabin.util;

import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class JwtUtil {
    // Ensure this matches the SECRET in SecurityConfig exactly
    private static final String SECRET = "my-super-secret-key-which-should-be-long-and-secure-123";

    public static String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour
                .signWith(Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8)), SignatureAlgorithm.HS256)
                .compact();
    }
}