package algoritmosjava.set;

import java.util.Objects;

/**
 * Clase Student {Inserte una descripción aqui}.
 * 
 * @author jezreel_avila
 * @created 03/06/2019
 */
public class Student implements Comparable{
    
    private int idStudent;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private double grade;
    private int startYear;

    public Student(int idStudent, String nombre, String apellidoPaterno, String apellidoMaterno, double grade, int startYear) {
        this.idStudent = idStudent;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.grade = grade;
        this.startYear = startYear;
    }
    
        

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.idStudent;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.apellidoPaterno);
        hash = 71 * hash + Objects.hashCode(this.apellidoMaterno);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.grade) ^ (Double.doubleToLongBits(this.grade) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.idStudent != other.idStudent) {
            return false;
        }
        if (Double.doubleToLongBits(this.grade) != Double.doubleToLongBits(other.grade)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidoPaterno, other.apellidoPaterno)) {
            return false;
        }
        if (!Objects.equals(this.apellidoMaterno, other.apellidoMaterno)) {
            return false;
        }
        return true;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    @Override
    public String toString() {
        return "Student{Hashcode:" + hashCode() + ",idStudent=" + idStudent + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", grade=" + grade + ", startYear=" + startYear + '}';
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if (this.idStudent > s.idStudent) {
            return 1;
        } else if (this.idStudent < s.idStudent) {
            return -1;
        } else {
            return 0;
        }
    }
    
    

}
