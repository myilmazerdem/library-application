package entity;

import java.time.LocalDate;

public class BookDetail {
    private Integer id;
    private String type;
    private LocalDate startingDate;
    private Integer memberId;
    private String status;

    public BookDetail() {
    }

    public BookDetail(Integer id, String type, LocalDate startingDate) {
        this.id = id;
        this.type = type;
        this.startingDate = startingDate;
    }

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

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
