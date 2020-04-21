
           Arrays.sort(s,0,n,new Comparator<Object>(){
          public int compare(Object a1, Object a2) {
              BigDecimal bigDec1 = new BigDecimal((String)a1);
              BigDecimal bigDec2 = new BigDecimal((String)a2);
              return bigDec2.compareTo(bigDec1);
            }
            });

        //Write your code here

