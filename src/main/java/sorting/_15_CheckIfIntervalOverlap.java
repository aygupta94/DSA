package sorting;

public class _15_CheckIfIntervalOverlap {

  static class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
      this.start = start;
      this.end = end;
    }

    public Interval() {
    }

    @Override
    public String toString() {
      return "Interval{" +
          "start=" + start +
          ", end=" + end +
          '}';
    }
  }
  public static void main(String[] args) {

    Interval x = new Interval(5,10);
    Interval y = new Interval(1,7);

    System.out.println(checkOverlap(x,y).toString());

  }

  private static Interval checkOverlap(Interval x, Interval y)
  {
    int max_start;

    if (x.start > y.start && x.start <y.end) {
      return new Interval(x.start, Math.min(x.end, y.end));
    } else if(y.start > x.start && y.start < x.end){
      return new Interval(y.start, Math.min(x.end, y.end));
    }

    return new Interval();
  }

}
