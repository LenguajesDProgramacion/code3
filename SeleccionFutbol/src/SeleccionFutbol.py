class SeleccionFutbol:

       def __init__(self, id, Nombre, Apellido, edad):
           self.__id = id
           self.__nombre = Nombre
           self.__apellido = Apellido
           self.__edad = edad
           self.jugar_partido = True
           self.jugar_partido_exterior = True
           self.concentracion = True

       def viajar(self , jugar_partido_exterior)-> bool:
            if jugar_partido_exterior == True:
                print("Hora de entrenar, hay partido")
            else:
                print("No se juega partido")
            return jugar_partido_exterior

       def concentrarse(self, jugar_partido, concentracion)-> bool:
           if jugar_partido == True:
               if concentracion == True:
                   print("Hay partido y concentracion")
               else:
                   print("No hay partido, ni concentracion")
           return  concentracion
