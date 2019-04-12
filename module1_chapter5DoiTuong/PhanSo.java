package module1_chapter5DoiTuong;

public class PhanSo {
	private int tuSo;
	private int mauSo;

	public PhanSo() {
		
	}
	public PhanSo(int tuSo, int mauSo) {
		super();
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	public int getTuSo() {
		return tuSo;
	}


	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}


	public int getMauSo() {
		return mauSo;
	}


	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int UCLN(int a, int b )
	{
		while(a!=b)
		{
			if(a>b)
			{
				a-=b;
			}
			else
			{
				b-=a;
			}
		}
		return a;
	}
	private void RutGonPhanSo()
	{
		int i = UCLN(this.getTuSo(),this.getMauSo());
		this.setTuSo(this.getTuSo()/i);
		this.setMauSo(this.getMauSo()/i);
	}
	
	private PhanSo tinhThuongPS(PhanSo ps1, PhanSo ps2)
	{
		int kqTu = ps1.tuSo*ps2.mauSo;
		int kqMau =  ps2.tuSo*ps1.mauSo;
		PhanSo kq =new PhanSo(kqTu, kqMau);
		kq.RutGonPhanSo();
		return kq;
		
	}
	private PhanSo tinhTichPS(PhanSo ps1, PhanSo ps2)
	{
		int kqTu = ps1.tuSo* ps2.tuSo;
		int kqMau = ps1.mauSo*ps2.mauSo;
		PhanSo kqTich =new PhanSo(kqTu, kqMau);
		kqTich.RutGonPhanSo();
		return kqTich;
		
	}
	private PhanSo tinhTongPS(PhanSo ps1, PhanSo ps2)
	{
		int kqTu = ps1.tuSo*ps2.mauSo + ps2.tuSo*ps1.mauSo;
		int kqMau = ps1.mauSo*ps2.mauSo;
		PhanSo kqTong =new PhanSo(kqTu, kqMau);
		kqTong.RutGonPhanSo();
		return kqTong;
		
	}
	private PhanSo tinhHieuPS(PhanSo ps1, PhanSo ps2)
	{
		int kqTu = ps1.tuSo*ps2.mauSo - ps2.tuSo*ps1.mauSo;
		int kqMau = ps1.mauSo*ps2.mauSo;
		PhanSo kqHieu =new PhanSo(kqTu, kqMau);
		kqHieu.RutGonPhanSo();
		//System.out.println("Hiệu 2 phân số = "+ kqHieu.tuSo +"/"+kqHieu.mauSo);
		return kqHieu;
		
	}
	public PhanSo tinh(String phepToan, PhanSo ps1, PhanSo ps2)
	{
		
		if("+".equals(phepToan))
		{
			
			return tinhTongPS(ps1, ps2);
			
			}
		else if("-".equals(phepToan))
		{
			System.out.println("aaaaaaaaaaaaaaaaaaaaaaa");
			return tinhHieuPS(ps1, ps2);
			}
		else if("*".equals(phepToan))
		{
			return tinhTichPS(ps1, ps2);
			}
		else if("/".equals(phepToan))
		{
			return tinhThuongPS(ps1, ps2);
			}
			return null;
			
	}

}
