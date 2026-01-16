import java.util.Date;
package baitapbuoi3;

public class baitap2 {
    public static void main(String[] args) {
       
    }
    class SinhVien {
        String MaSV, HoTen, NoiSinh;
        Date NgaySinh;
        double diemlt, diemth, diemtb;
        public Sinhvien (String ma, String ht, Date ngs, String ns, String mh, double lt, double th) {
            MaSV = ma;
            HoTen = ht;
            NgaySinh = ngs;
            NoiSinh = ns;
            diemlt = lt;
            diemth = th;
        }
        public double diemTB() {
            return (diemlt + diemth) / 2;
        }
        public void InDiem (){
            System.out.println(MaSV+ "\t"+ HoTen + "\t" + NgaySinh + "\t" + NoiSinh + "\t" + diemlt + "\t" + diemth + "\t" + diemtb);
        }
    }    
}
