class Calculator{
    int a;
public int add(int num1, int num2){
    int r = num1 + num2;
    return r;
}
public int sub(int num1, int num2){
    int r1 = num1 - num2;
    return r1;
}
public int mul(int num1, int num2){
    int r2 = num1 * num2;
    return r2;
}
public float div(float num1, float num2){
    float r3 = num1/num2;
    return r3;
}
}

public class Demo
{
    public static void main(String[] args)
    {
        int num1= 1;
        int num2 = 8;
        Calculator calc = new Calculator();
        int result = calc.add(1, 8);
        System.out.println(result);

        int result1 = calc.sub(10, 8);
        System.out.println(result1);

        int result2 = calc.mul(10, 8);
        System.out.println(result2);

        float result3 = calc.div(15.0f, 4.0f);
        System.out.println(result3);
    }
}
