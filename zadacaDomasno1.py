import string


produkti = []
cena = []

brojProdukti = (int(input("Vnesi kolku produkti: ")))
suma = 0
brojac = 0


for i in range(0, brojProdukti):
    produkti.append(input())
    cena.append(int(input()))
    

    
res = "\n".join("{} : {}".format(x, y) for x, y in zip(produkti, cena))
print (res)

plateno = int (input("Vnesete suma na pari koja ja plakate: "))
while (brojac < len(cena)):
    suma = suma + cena[brojac]
    brojac += 1


print ("Treba da se vrati kusur: ", plateno - suma)
