package baitapbuoi3;
import java.util.Scanner;

// import java.util.Date;
public class thongtinsinhvien {
    static class SinhVien {
        String MaSV, HoTen, NoiSinh;
        String NgaySinh;
        String Lop, MonHoc;
        double diemlt, diemth, diemtb;
        // public SinhVien (String ma, String ht, Date ngs, String ns, String l, String mh, double lt, double th)
        // {
        //     MaSV = ma; 
        //     HoTen = ht;
        //     NoiSinh = ns;
        //     NgaySinh = ngs;
        //     Lop = l;
        //     MonHoc = mh;
        //     diemlt = lt;
        //     diemth = th;
        // }
        
        // Nhap thong tin sinh vien
        public void nhapthongtin(){
            Scanner key = new Scanner(System.in);
            System.out.print("Nhap ma so sinh vien cua ban: ");
            MaSV = key.nextLine();

            System.out.print("Nhap ho ten cua ban: ");
            HoTen = key.nextLine();

            System.out.print("Nhap noi sinh cua ban: ");
            NoiSinh = key.nextLine();

            System.out.print("Nhap ngay sinh cua ban: ");
            NgaySinh = key.nextLine();

            System.out.print("Nhap lop cua ban: ");
            Lop = key.nextLine();

            System.out.print("Nhap mon hoc cua ban: ");
            MonHoc = key.nextLine();

            System.out.print("Nhap diem ly thuyet cua ban: ");
            diemlt = key.nextDouble();

            System.out.print("Nhap diem thuc hanh cua ban: ");
            diemth = key.nextDouble();
            diemtb = DiemTB();

        }
        // Tinh diem trung binh
        public double DiemTB()
        {
            return (diemlt + diemth)/2;
        }
        // Hien thi sinh vien
        public void InDiem(){
            System.out.println(MaSV + "\t" + HoTen + "\t"+ NgaySinh + "\t"+ NoiSinh+ "\t" + Lop + "\t"+ MonHoc + "\t" + diemtb);
        }
    }
    // main 
    public static void main(String[] args) {
        System.out.println("=== NHẬP THÔNG TIN SINH VIÊN ===");
        SinhVien sv = new SinhVien();
        sv.nhapthongtin();
        System.out.println("=== THÔNG TIN SINH VIÊN ===");
        sv.InDiem();

    }
}
