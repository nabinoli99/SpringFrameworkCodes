package in.hisabkitab.model.expense;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Category
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Category_Id")
    private int id;

    @Column(name = "Category_name")
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Expense> expenses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
