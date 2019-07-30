//연료 고갈이라는 에러를 클래스로 명시함
class FuelExceotion extends Exception{
    public void solve() {

    }
}
/*
    Exception 이 깐깐하다. : 컴파일이 안된다 ...
    -함수에서 에러가 발생할 수 있다면 그 사실을 선언부에 명시해야 컴파일 된다. runtimeException은 싱행가능

 */
public class Test075 {
    public void carDrive( int fuel) throws FuelExceotion {
        if(fuel == 0){
//            throw new 배째기(); // 이 있고 Exception의 경우 함수 매개변수 오른쪽에 throws 배쨰기 해야함
            throw new FuelExceotion();
        }
        System.out.println("GOGO!!");
    }
    public static void main(String[] args) {
        Test075 t =new Test075();
        try{
            t.carDrive(100);
        }catch (FuelExceotion e){
            e.solve();//e로 접근하여 해결도 가능
            System.out.println("견인차를 불러라");
        }
    }
}
/*
    throws FuelException 으로 선언된 험슈룰 호출할 때는
    반드시 에러가 발생할 수 있는 영역으로 try{...} 로 감싸준다.

    try 애는 반드시 1개 이상의 catch 가 있어야 한다.
    에러가 발생되며 에러 인스턴스를 throw 한다.

    catch( FuelException e)에 있는 e 변수가 발생된 에러 인스턴스르 가리킬 수 있으면
    catch 에 딸린 {...} 영역이 동작한다.
     ... 에는 에러를 수습할 수 있는 코드가 들어가는 것이 바람직하다.

    catch( Exception e) 을 써도 되는? ok
 */
