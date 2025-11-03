public class Question1 {
    public static void main(String[] args) {
        float pencil = 24.7f;
        float pen = 73.9f;
        float eraser = 4.3f;
        System.out.println("pencil:"+ pencil);
        System.out.println("pen:"+ pen);
        System.out.println("eraser:"+ eraser);

        double sum = (pencil+pen+eraser);
        System.out.println("amount of items:"+ sum);

        double Tax = (sum*18)/100;
        System.out.println("GST:"+Tax);

        double Bill = sum + Tax;
        System.out.println("total bill:"+ Bill);
    }
}
