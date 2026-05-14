""""
# with helper funstion => for hide complex details over function call
# with helper => fn call only => letterCombinations(digits) => best practice
# without helper => fn call =>  letterCombinations(0,"",keypad,digits,result)

#Note => we can also use list instead of dictionary for keypad => ["","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"] => then we can access with index => keypad[int(digits[indx])]

def helper(indx,curr,digits,keypad,result):
    if(indx == len(digits)):
        result.append(curr)
        return 
    
    for ch in keypad[digits[indx]]:
        helper(indx+1,curr+ch,digits,keypad,result)
    

def letterCombinations(digits):
    if not digits:
        return []
    
    keypad = {
        "2":"abc",
        "3":"def",
        "4":"ghi",
        "5":"jkl",
        "6":"mno",
        "7":"pqrs",
        "8":"tuv",
        "9":"wxyz"
    }
    
    result = []
    helper(0,"",digits,keypad,result)
    return result
    
digits = input()
print(letterCombinations(digits))
"""

#without helper function 
def letterCombinations(indx,curr,keypad,digits,result):
    if not digits:
        return []
    if(indx == len(digits)):
        result.append(curr)
        return
    
    for ch in keypad[digits[indx]]:
        letterCombinations(indx+1,curr+ch,keypad,digits,result)
        
def main():
    digits = input()
    result =[]
    keypad = {
        "2":"abc",
        "3":"def",
        "4":"ghi",
        "5":"jkl",
        "6":"mno",
        "7":"pqrs",
        "8":"tuv",
        "9":"wxyz"
    }
    letterCombinations(0,"",keypad,digits,result)
    print(result)
    
if __name__ == "__main__":
    main()
    

# ip => 23
# op => ["ad","ae","af","bd","be","bf","cd","ce","cf"]


    
    