    public class Shape {
        public double length;
        public double width;
        public double height;
        public double volume;

        public Shape(double length, double width, double height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }
        public double compareTo(Shape shape) {
            return shape.volume - this.volume;
        }

        private double calculateVolume() {
            return volume = this.length * this.width * this.height;
        }

        public void cetak() {
            this.volume = this.calculateVolume();
            System.out.println("Panjang x Lebar x Tinggi = " + length + " x " + width + " x " + height);
            System.out.println("Volume = " + volume);
        }
    }
