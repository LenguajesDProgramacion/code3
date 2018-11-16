from src.SeleccionFutbol import SeleccionFutbol

class Entrenador(SeleccionFutbol ) :
    def __init__(self, idFederacion, Nombre, Apellido, edad):
        super().__init__(idFederacion, Nombre, Apellido, edad)
        self.nombre=Nombre
        self.idFederacion= idFederacion

    def getNombre_entrenador(self):
            return self.nombre

    def get_Id_Entrenador(self):
       return self.idFederacion

    def set_idEntrenador(self, idFederacion):
        self.idFederacion1 = idFederacion

    def entrenar(self, partido, partido_exterior):
        if partido ==True & partido_exterior==True:
            print("Entrenador entrena equipo")
        else:
            print("No hay entrenamiento")
