public class Fecha {

        private int dia;
        private int mes;
        private int año;

        //Constructor por defecto
        public Fecha() {
        }

        //Constructor con parámetros
        public Fecha(int dia, int mes, int año) {
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        }

        //setters y getters
        public void setDia(int d) {
            dia = d;
        }
        public void setMes(int m) {
            mes = m;
        }
        public void setAño(int a) {
            año = a;
        }
        public int getDia() {
            return dia;
        }
        public int getMes() {
            return mes;
        }
        public int getAño() {
            return año;
        }

        //Método para comprobar si la fecha es correcta

        public boolean fechaCorrecta() {
            boolean diaCorrecto, mesCorrecto, añoCorrecto;
            añoCorrecto = año > 0;
            mesCorrecto = mes >= 1 && mes <= 12;
            switch (mes) {
                case 2:
                    if (esBisiesto()) {
                        diaCorrecto = dia >= 1 && dia <= 29;
                    } else {
                        diaCorrecto = dia >= 1 && dia <= 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    diaCorrecto = dia >= 1 && dia <= 30;
                    break;
                default:
                    diaCorrecto = dia >= 1 && dia <= 31;
            }
            return diaCorrecto && mesCorrecto && añoCorrecto;
        }

        //Método privado para comprobar si el año es bisiesto


        private boolean esBisiesto() {
            return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
        }

        //Método que modifica la fecha cambiándola por la del día siguiente
        public void diaSiguiente() {
            dia++;
            if (!fechaCorrecta()) {
                dia = 1;
                mes++;
                if (!fechaCorrecta()) {
                    mes = 1;
                    año++;
                }

            }
        }

        //Método toString para mostrar la fecha
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (dia < 10) {
                sb.append("0");
            }
            sb.append(dia);
            sb.append("-");
            if (mes < 10) {
                sb.append("0");
            }
            sb.append(mes);
            sb.append("-");
            sb.append(año);
            return sb.toString();
        }
  }
