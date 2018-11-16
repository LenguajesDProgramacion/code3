import  unittest
from src.SeleccionFutbol import SeleccionFutbol
from src.Entrenador import Entrenador

class SeleccionFutbolTest(unittest.TestCase):
    def test_viajar(self):
        Seleccionl = SeleccionFutbol(101 , "Marvin", "Fernandez", 23)
        expect = Seleccionl.viajar(True)
        actual= True
        self.assertEqual(expect, actual)

    def test_entrenador_Poliformismo(self):
        Pep = Entrenador("Ent-408" , "Pep", "Guardiola", 47 )
        actual = Pep.get_Id_Entrenador()
        expect = "Ent-408"
        self.assertEqual(expect, actual)

    def test_concentrarse(self):
        Seleccion2 = SeleccionFutbol(101 , "Marvin", "Fernandez", 23)
        actual = Seleccion2.concentrarse(True,True)
        expect= True
        self.assertEqual(actual,expect)
