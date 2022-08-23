import csv

matriz=[]
with open('presenciaredes.csv', newline='') as z:
    y = csv.DictReader(z)
    for row in y:
            matriz.append(row)
x=1
while x != 0:
    print("""
\tAcciones del programa
\t\t1.- Diferencia de seguidores em Twitter
\t\t2.- Diferencia de visualizaciones de Youtube
\t\t3.- Promedio de cremiento de Twitter y Facebook
\t\t0.- Salir
    """)
    x=int(input("\tTecle el numero de la accion a realizar: "))
    if x==1:
        a=matriz[7]['ENERO']
        b=matriz[7]['JUNIO']
        ress= int(b) - int(a)
        print("\n\tLa diferencia de seguidores en el intervalo de Enero a Junio en Twitter fue de ", ress)
    elif x==2:
        print("""
\tMeses contemplados
\t\t1.- Enero
\t\t2.- Febrero
\t\t3.- Marzo
\t\t4.- Abril
\t\t5.- Mayo
\t\t6.- Junio
        """)
        h=int(input("\n\tTeclee el numero del mes que desee: "))
        if h == 1:
            d=matriz[15]['ENERO']
            c="Enero"
        elif h == 2:
            d=matriz[15]['FEBRERO']
            c="Febrero"
        elif h == 3:
            d=matriz[15]['MARZO']
            c="Marzo"
        elif h == 4:
            d=matriz[15]['ABRIL']
            c="Abril"
        elif h == 5:
            d=matriz[15]['MAYO']
            c="Mayo"
        elif h == 6:
            d=matriz[15]['JUNIO']
            c="Junio"
        else:
            print("Datos invalidos, intente otra vez")
        j=int(input("\tTeclee el numero otro mes que desee: "))
        if j != h and h<j:
            if j == 1:
                e=matriz[15]['ENERO']
                f="Enero"
            elif j == 2:
                e=matriz[15]['FEBRERO']
                f="Febrero"
            elif j == 3:
                e=matriz[15]['MARZO']
                f="Marzo"
            elif j == 4:
                e=matriz[15]['ABRIL']
                f="Abril"
            elif j == 5:
                e=matriz[15]['MAYO']
                f="Mayo"
            elif j == 6:
                e=matriz[15]['JUNIO']
                f="Junio"
            res = int(e) - int(d)
            print(f"\n\tLa diferencia de visualizaciones en Youtube de el mes {c} al mes {f} es de {res}")
        elif h>j:
            print("\n\t\t\tDatos invalidos, intente otra vez")
        elif j==h:
            print("\n\t\t\tLa diferecia es de 0")

    elif x == 3:
        a0=matriz[1]['ENERO']
        a1=matriz[1]['FEBRERO']
        a2=matriz[1]['MARZO']
        a3=matriz[1]['ABRIL']
        a4=matriz[1]['MAYO']
        a5=matriz[1]['JUNIO']
        b0=matriz[8]['ENERO']
        b1=matriz[8]['FEBRERO']
        b2=matriz[8]['MARZO']
        b3=matriz[8]['ABRIL']
        b4=matriz[8]['MAYO']
        b5=matriz[8]['JUNIO']
        pf=float((int(a0)+int(a1)+int(a2)+int(a3)+int(a4)+int(a5))/6)
        pt=float((int(b0)+int(b1)+int(b2)+int(b3)+int(b4)+int(b5))/6)
        print(f"\n\tEl promedio de cremiento en Facebook de Enero a Junio fue de {pf}\n\nEl promedio de crecimiento en Twitter de Enero a Junio fue de {pt}")
    elif x==0:
        print("\n\t\t\tAdios :D")
    else:
        print("\n\t\t\tOpción no valida. Intente otra vez")
