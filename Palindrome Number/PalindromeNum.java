class PalindromeNum {
    public boolean isPalindrome(int x) {
        Integer a = new Integer(x);
		String b = a.toString();
		String c = "";
        
        for (int i=b.length(); i > 0; i--) {
			c += b.substring(i - 1, i);
		}
        if(c.equals(b)){
            return true;
        }else{
            return false;
        }
      
      
    }
}