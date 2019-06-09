package w16;
import javax.swing.JOptionPane;
public class apples 
{

	public static void main(String[] args) 
	{	
		float wid,high;
		int answer=0;
		boolean conti=true;
		do{
		wid=Float.parseFloat(JOptionPane.showInputDialog("Please enter width of a retangle."));
		high=Float.parseFloat(JOptionPane.showInputDialog("Please enter high of a retangle."));
		String s=String.format("width:%.2f\nhigh:%.2f\narea:%.2f\nperimeter:.2f", wid,high,wid*high,(wid+high)*2);
		JOptionPane.showMessageDialog(null,s,"Retangle",JOptionPane.INFORMATION_MESSAGE);
		answer = JOptionPane.showConfirmDialog(null, "One more time?","Click one button", JOptionPane.YES_NO_CANCEL_OPTION);
		}while(answer==0);
		//Q2
		answer=0;
		float s1,s2,s3,s;
		String a = null;
		double area;
		do{
			s1=Float.parseFloat(JOptionPane.showInputDialog("Please enter first side of a triangle."));
			s2=Float.parseFloat(JOptionPane.showInputDialog("Please enter second side of a triangle."));
			s3=Float.parseFloat(JOptionPane.showInputDialog("Please enter third side of a triangle."));
			if (s1+s2<=s3||s2+s3<=s1||s3+s1<=s2)
				JOptionPane.showMessageDialog(null,"it can't be a triangle","Triangle",JOptionPane.INFORMATION_MESSAGE);
			else
			{
				s=(s1+s2+s3)/2;
				area=Math.pow((s*(s-s1)*(s-s2)*(s-s3)), 0.5);
				if(s1==s2 && s1==s3)
					a="It is an equilateral triangle.";
				else if(s1==s2||s2==s3||s1==s3)
					a="It is an isosceles triangle.";
				else if(Math.pow(s1, 2)+Math.pow(s2, 2)==Math.pow(s3, 2)||Math.pow(s2, 2)+Math.pow(s3, 2)==Math.pow(s1, 2)||Math.pow(s1, 2)+Math.pow(s3, 2)==Math.pow(s2, 2))
					a="It is an right triangle.";
				String str=String.format("%.2f - %.2f - %.2f\narea:%.2f\nperimeter:%.2f\n"+a, s1,s2,s3,area,(s1+s2+s3));
				JOptionPane.showMessageDialog(null,str,"Triangle",JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			answer = JOptionPane.showConfirmDialog(null, "One more time?","Click one button", JOptionPane.YES_NO_CANCEL_OPTION);
		}while(answer==0);
	}

}
