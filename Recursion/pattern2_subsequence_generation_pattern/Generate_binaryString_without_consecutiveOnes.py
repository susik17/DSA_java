def generate(n,curr,result):
    
    #Base case 
    if len(curr) == n:
        result.append(curr)
        return
    
    #Add "0"
    generate(n,curr+"0",result)
    
    #Add "1" => only curr empty(start) || prev char != 1
    if not curr or curr[-1] != '1':
        generate(n,curr+"1",result)
        
    
    
def  main():
    n = int(input("n: "))
    result = []
    generate(n,"",result)
    print(result)

if __name__ == "__main__":
    main()

""""
ip:3
op:['000', '001', '010', '100', '101']
"""