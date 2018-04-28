public class Book {
    long id;
    long no;
    String name;
    int state;
    long rentTime;
    long times;

    public long getNo() {
        return no;
    }

    public void setNo(long no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public long getRentTime() {
        return rentTime;
    }

    public void setRentTime(long rentTime) {
        this.rentTime = rentTime;
    }

    public long getTimes() {
        return times;
    }

    public void setTimes(long times) {
        this.times = times;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book(long id, String name) {
        this.id = id;
        this.name = name;
        this.state = 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state=" + state +
                ", rentTime=" + rentTime +
                ", times=" + times +
                '}';
    }
}
