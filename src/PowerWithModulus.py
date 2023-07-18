def PowerWithModulus(base,power,modulus):
    product=1
    for i in range(power):
        product=(product*base)%modulus
    return product
base=int(input())
power=int(input())
modulus=int(input())
print(PowerWithModulus(base,power,modulus))
