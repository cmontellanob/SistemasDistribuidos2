using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace Cotizador
{
    /// <summary>
    /// Descripción breve de BancoCentral
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class BancoCentral : System.Web.Services.WebService
    {

        [WebMethod]
        public double ObtenerCotizcion(String fecha)
        {
            return 6.96;
        }
    }
}
