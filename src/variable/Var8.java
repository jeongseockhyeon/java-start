package variable;

public class Var8 {
    public static void main(String[] args) {
        byte b =127; // -128 ~ 127 1byte
        short s = 32767; // -32,768 ~ 32,767 2byte
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647(약 20억) 4byte
        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 8byte, 소문자 ㅣ도 가능하지만 오인할 수 있기 때문에 대문자 L로 사용
        long l = 92233720685477480L;

        //실수
        float f = 10.0f; // 7자리 정밀도, 4byte
        double d = 10.0; // 15자리 정밀도, 8byte

        //boolean : 1byte, char: 1byte, String:문자 길이에 따라 동적으로 메모리 사용량이 달라진다.

        //실무에서 잘 사용하지 않는 변수
        //byte,short,float,char
        //자주 사용하는 변수
        //정수 - int,long
        //실수 - double
        //불린형 - boolean
        //문자열 - String
    }
}
