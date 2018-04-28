package main.bean;

public class Book {
//    编号
    int id;
//    书名
    String name;
//    状态 1借出0未借出
    int state;
//    借出时间
    String rentTime;
//    借阅次数
    int count;

    public Book(String name) {
        this.name = name;
        this.state = 0;
        this.rentTime = null;
        this.count = 0;
    }

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

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getRentTime() {
        return rentTime;
    }

    public void setRentTime(String rentTime) {
        this.rentTime = rentTime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
