namespace ConsumirCotizador
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.Obtener = new System.Windows.Forms.Button();
            this.txtFecha = new System.Windows.Forms.TextBox();
            this.lblCotizacion = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // Obtener
            // 
            this.Obtener.Location = new System.Drawing.Point(128, 88);
            this.Obtener.Name = "Obtener";
            this.Obtener.Size = new System.Drawing.Size(94, 37);
            this.Obtener.TabIndex = 0;
            this.Obtener.Text = "Obtener";
            this.Obtener.UseVisualStyleBackColor = true;
            this.Obtener.Click += new System.EventHandler(this.Obtener_Click);
            // 
            // txtFecha
            // 
            this.txtFecha.Location = new System.Drawing.Point(128, 29);
            this.txtFecha.Name = "txtFecha";
            this.txtFecha.Size = new System.Drawing.Size(100, 20);
            this.txtFecha.TabIndex = 1;
            // 
            // lblCotizacion
            // 
            this.lblCotizacion.AutoSize = true;
            this.lblCotizacion.Location = new System.Drawing.Point(128, 155);
            this.lblCotizacion.Name = "lblCotizacion";
            this.lblCotizacion.Size = new System.Drawing.Size(13, 13);
            this.lblCotizacion.TabIndex = 2;
            this.lblCotizacion.Text = "--";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.lblCotizacion);
            this.Controls.Add(this.txtFecha);
            this.Controls.Add(this.Obtener);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button Obtener;
        private System.Windows.Forms.TextBox txtFecha;
        private System.Windows.Forms.Label lblCotizacion;
    }
}

