package Jan15th_javacrux2022_lecture18_Arraylist2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    string smallestNumber(string p) {
			        string ans ;
			        char count = '1';
			        int c = 1;
			        for(int i=0;i<p.size();i++)
			        {
			            if(p[i] == 'D')
			                c++;
			            else
			                break;
			        }
			        int t = c;
			        while(c > 1)
			        {
			            ans += to_string(c);
			            c--;
			            
			            count = '0' + t;
			            flag = true;
			        }
			        
			        ans += '1';
			        t--;
			        for(int i=t;i<p.size();i++)
			        {
			            if(p[i] == 'I')
			            {
			                count++;
			                ans += count;
			            }
			            else
			            {
			                count++;
			                int temp = i;

			                while(ans[temp-1] > ans[temp])
			                {
			                    temp--;
			                
			                }
			                string a;
			                a += count;
			                ans.insert(temp,a);
			            }
			        }
			        return ans;
			    }
			};
			https://leetcode.com/problems/construct-smallest-number-from-di-string/solutions/2424040/c-easy-to-understand-o-n-solution/
				
				===
//						StringBuilder res = new StringBuilder(), stack = new StringBuilder();
//		        for (int i = 0; i <= s.length(); i++) {
//		            stack.append((char)('1' + i));
//		            if (i == s.length() || s.charAt(i) == 'I') {
//		                res.append(stack.reverse());
//		                stack = new StringBuilder();
//		            }
//		        }
//		        return res.toString();
