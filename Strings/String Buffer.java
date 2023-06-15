class String{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer (500);
        long startTime = System.currentTimesMilles();
        for(int i=0;i<=500;i++){
            sb.append(Str:"Test");
        }
        System.out.println("String Buffer Time"+ (System.currentTimesMilles() - startTime));
        StringBuilder stringbuilder =new Stringbuilder(str:"Testing");
        long startTime = system.currentTimeMilles();
        for(int i=0;i<=00;i++){
            sb.append(str:"Test");
        }
        System.out.println("String Builder Time"+ (System.currentTimesMilles() - startTime));
    }
}