package PuntoVentaMobile.mx;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usuario", schema = "puntoventamobile", catalog = "")
public class UsuarioEntity {
    private int idUsuario;
    private String usuario;
    private String password;

    @Id
    @Column(name = "id_usuario")
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "usuario")
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEntity that = (UsuarioEntity) o;
        return idUsuario == that.idUsuario &&
                Objects.equals(usuario, that.usuario) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, usuario, password);
    }
}
