// SYNTAX:

// returnType functionName(Parameter){
       // function body:code to perform the task;
//    return value;
// }


public class calculator {

    int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        calculator calc = new calculator();
        int result = calc.add(5,6);
        System.out.println("The sum of two number :"+result);

    }
}
