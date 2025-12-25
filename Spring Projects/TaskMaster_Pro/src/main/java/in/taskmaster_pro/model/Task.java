package in.taskmaster_pro.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task
{
    private int id;
    private String title;
    private String description;
    private boolean completed;
}
