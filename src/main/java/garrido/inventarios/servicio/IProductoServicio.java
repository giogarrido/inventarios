package garrido.inventarios.servicio;

import garrido.inventarios.modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> listarProductos();

    public Producto buscarProductoPorId(Integer idProducto);

    public void guardarProducto(Producto producto);

    public void elminarProductoPorId (Integer idProducto);


}
