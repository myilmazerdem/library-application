package entity;

import java.util.ArrayList;

public class Member {
    //• While some of the books are borrowable by the members and can be taken out of the
    //library, the Handwritten books are not permitted to be borrowed by any member. On
    //the other hand, any member can borrow a Printed book, but it is also possible to read
    //it without borrowing.
    //• For the extension process, if the due date has not yet been missed and the due date
    //of the borrowed book has not been extended before, the time allowed to the Library
    //entity.Member is doubled.
    //variables

    private Integer id;

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
