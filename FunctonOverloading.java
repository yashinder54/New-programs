class FunctionOverloading{
    public int area(int a){
        return a*a;
    }
    public int area(int a,int b){
        return a*b;
    }
    public float area(float a){
        float pi = 3.14f;
        return pi*a;
    }
    public static void main(String args[]){
        FunctionOverloading fo = new FunctionOverloading();
        System.out.print(fo.area(4));
        System.out.print(fo.area(6));
    }
}