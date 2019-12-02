using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Sumas
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int a = int.Parse(txtA.Text);
            int b = int.Parse(txtA.Text);
            operaciones.OperacionesSoapClient cl = new operaciones.OperacionesSoapClient();
            int c=cl.Sumar(a, b);
            lblResultado.Text = c.ToString();
        }
    }
}
