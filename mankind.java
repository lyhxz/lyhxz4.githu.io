public class mankind {
    private int ages;
    private String name;
    public mankind(String name,int ages){
        this.name=name;
        this.ages=ages;
    }
}
class students extends mankind{
    public students(String name, int ages) {
        super(name, ages);
    }

    public void stu(){
    System.out.println("学习");
    }
    public void stu1(){
        System.out.println("年纪较小");
    }
}
class teacher extends mankind{
    public teacher(String name, int ages) {
        super(name, ages);
    }

    public void tea(){
        System.out.println("教书育人");
    }
    public void tea1(){
        System.out.println("年纪较大");
    }
}
