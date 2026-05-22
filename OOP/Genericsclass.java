class Box<T>
{
    T data;

    void setData(T data)
    {
        this.data = data;
    }

    T getData()
    {
        return data;
    }
}

class Demo
{
    public static void main(String args[])
    {
        // Integer type object
        Box<Integer> b1 = new Box<Integer>();
        b1.setData(100);
        System.out.println("Integer Value: " + b1.getData());

        // String type object
        Box<String> b2 = new Box<String>();
        b2.setData("Hello");
        System.out.println("String Value: " + b2.getData());
    }
}
