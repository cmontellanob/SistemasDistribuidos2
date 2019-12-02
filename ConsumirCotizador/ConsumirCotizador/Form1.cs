using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ConsumirCotizador
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Obtener_Click(object sender, EventArgs e)
        {
            Central.BancoCentralSoapClient cl = new Central.BancoCentralSoapClient();
            double resultado=cl.ObtenerCotizcion(txtFecha.Text);
            lblCotizacion.Text = resultado.ToString();
        }
    }
}
