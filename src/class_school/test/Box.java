package class_school.test;

public class Box {
  private int width, length, height;
  // private int volume;
  public Box(int w, int len, int h) {
    width = w;
    length = len;
    height = h;

    // volume = width*length*height;
  }

  public int getVolume() {
    return width*length*height;
  }

  public static Box whoisLargerBox(Box box1, Box box2) {
    if (box1.getVolume() > box2.getVolume()) {
      return box1;
    }
    return box2;
  }

  /*
   * 인자로 주어지는 Box 객체와 동일한 너비와 높이를 가지는 Box인지 체크하는 메소드
   * 같으면 true, 다르면 false를 반환
   */
  public boolean isSameBox(Box box) {
    /*
     * 나의 width, length, height가 인자로 주어진 box의 그것과 모두 같으면 true를
     * 반환, 그렇지 않으면 false를 반환
     */
    if (width == box.width && length == box.length && height == box.height)
      return true;
    return false;
  }

  public static void main(String[] args) {
    Box b1 = new Box(10, 20, 50);
    Box b2 = new Box(10, 30, 30);
    System.out.println("첫 번째 박스의 부피:" + b1.getVolume());
    System.out.println("두 번째 박스의 부피:" + b2.getVolume());

    Box largerBox = Box.whoisLargerBox(b1, b2);
    boolean result = b1.isSameBox(b2);
    System.out.println("박스1과 박스2는 같다?:"+result);
    System.out.println("더 큰 박스의 부피: " + largerBox.getVolume());
  }
}
