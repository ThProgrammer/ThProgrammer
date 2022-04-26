qt = int(input("Qual o troco?"))

count25 = 0
count10 = 0
count5 = 0
count1 = 0

while qt != 0:

    while qt < 25:
        count25 = 0
        qt -= 25
        count25+=1

    while qt < 10:
        count10 = 0
        qt -= 10
        count10+=1

    while qt < 5:
        count5 = 0
        qt -= 5
        count5+=1

    while qt < 1:
        count1 = 0
        qt -= 1
        count1+=1

print(count25 + count10 + count5 + count1)

    



