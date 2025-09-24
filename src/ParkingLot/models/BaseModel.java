package ParkingLot.models;

import java.util.Date;

public class BaseModel
{
    private int id;
    private Date createdAt;
    private Date lastModified;

    public BaseModel()
    {
        this(-1);
    }

    public BaseModel(int id)
    {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
}
