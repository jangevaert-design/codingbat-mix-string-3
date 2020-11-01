public class MixString3 {
  public String mixString(String a, String b) {
    int min = Math.min(a.length(), b.length());
    String result = "";
    int i = 0;

    while (i < min) {
      String suba = a.substring(i, i + 1);
      String subb = b.substring(i, i + 1);

      result += suba + subb;
      i++;
    }
    return result + a.substring(i) + b.substring(i);
  }
}
