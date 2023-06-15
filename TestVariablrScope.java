class TestVariableScope{
    int a = 0;
    static int b = 0;
    public void increment(){
        a++;
        b++;
        System.out.println("a = "+ a +" b = "+b);
    }
    public static void main(String args[]){
        TestVariableScope tvs = new TestVariableScope();
        tvs.increment();
        TestVariableScope tvs2 = new TestVariableScope();
        tvs2.increment();
    }
}