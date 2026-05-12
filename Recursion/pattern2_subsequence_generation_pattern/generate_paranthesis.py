def generate(n,curr,op,cp,result):
    
    #Base case 
    if (len(curr) == 2*n):
        result.append(curr)
        return

    # Add open paranthesis with condition 
    if(op < n) :
        generate(n,curr+"(",op+1,cp,result)
    # Add close paranthesis with condition 
    if(cp < op) :
        generate(n,curr+")",op,cp+1,result)
   
    
        
    
    
def  main():
    n = int(input("n: "))
    result = []
    #open_paranthesis => op  close_paranthesis => cp
    op, cp = 0, 0
    generate(n,"",op,cp,result)
    print(result)

if __name__ == "__main__":
    main()
