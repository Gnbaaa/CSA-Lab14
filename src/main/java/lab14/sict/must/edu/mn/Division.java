package lab14.sict.must.edu.mn;

/**
 * Хуваах үйлдлийг гүйцэтгэх класс.
 */
public class Division {
    /**
     * Хоёр тоог хуваана.
     *
     * @param a Эхний тоо
     * @param b Хуваагч
     * @return Тоонуудын хуваалт
     * @throws IllegalArgumentException Хуваагч нь тэг байвал
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй");
        }
        return a / b;
    }
}

