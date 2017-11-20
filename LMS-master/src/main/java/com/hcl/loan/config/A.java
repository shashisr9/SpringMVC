package com.hcl.loan.config;

private class C
{
    private String cTemp = new String();
	class B
    {
        String temp = new String();
        void setCTemp(){
        	cTemp="hello";
        }
    }
    public void setBTemp() {
    	B b = new B();
    	b.temp="abc";
    }
    
    
}
 
class A extends C
{
    public static void main(String[] args)
    {
        C c = new C();
    	C.B b = c.new B();
    }
     void setBTemp() {
    	B b = new B();
    	b.temp="abc";
    }
       
}