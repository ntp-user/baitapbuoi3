package baitapbuoi3;
import java.util.Scanner;

public class thongtinnhanvien {
    static class NhanVien{
        String MaNV,HoTen, NoiSinh, GioiTinh, CongViec ;
        String NgaySinh;
        double luongcb , hesoluong, luongcs;
        // nhap thong tin nhan vien
        public void nhapthongtin(){
        Scanner key = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        MaNV = key.nextLine();

        System.out.print("Nhap ho ten nhan vien: ");
        HoTen = key.nextLine();

        System.out.print("Nhap ngay sinh nhan vien: ");
        NgaySinh = key.nextLine();

        System.out.print("Nhap gioi tinh nhan vien: ");
        GioiTinh = key.nextLine();

        System.out.print("Nhap noi sinh nhan vien: ");
        NoiSinh = key.nextLine();

        System.out.print("Nhap cong viec nhan vien: ");
        CongViec = key.nextLine();
        
        System.out.print("Nhap he so luong: ");
        hesoluong = key.nextDouble();

        System.out.print("Nhap luong co so: ");
        luongcs = key.nextDouble();
        luongcb = LuongCB();
        }
        
        // tinh luong co ban
        public double LuongCB(){
            return (hesoluong * luongcs);
        }
        
        // hien thi nhan vien
        public void InNhanVien(){
            System.out.print(MaNV + "\t" + HoTen + "\t" + NgaySinh + "\t" + GioiTinh + "\t" + NoiSinh + "\t" + CongViec + "\t" + luongcb);
        }
    }
    public static void main(String[] args) {
       System.out.println("=== Nhập Thông tin nhân viên ===");
       NhanVien nv = new NhanVien();
       nv.nhapthongtin();
       System.out.println("=== Thông tin nhân viên ===");
       nv.InNhanVien(); 
    } 
}
