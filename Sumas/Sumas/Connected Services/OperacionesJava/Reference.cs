﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.42000
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Sumas.OperacionesJava {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(Namespace="http://Operaciones/", ConfigurationName="OperacionesJava.Operaciones")]
    public interface Operaciones {
        
        // CODEGEN: Se está generando un contrato de mensaje, ya que el espacio de nombres de partes de mensaje () no coincide con el valor predeterminado (http://Operaciones/).
        [System.ServiceModel.OperationContractAttribute(Action="http://Operaciones/Operaciones/sumarRequest", ReplyAction="http://Operaciones/Operaciones/sumarResponse")]
        [return: System.ServiceModel.MessageParameterAttribute(Name="return")]
        Sumas.OperacionesJava.sumarResponse sumar(Sumas.OperacionesJava.sumarRequest request);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://Operaciones/Operaciones/sumarRequest", ReplyAction="http://Operaciones/Operaciones/sumarResponse")]
        System.Threading.Tasks.Task<Sumas.OperacionesJava.sumarResponse> sumarAsync(Sumas.OperacionesJava.sumarRequest request);
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="sumar", WrapperNamespace="http://Operaciones/", IsWrapped=true)]
    public partial class sumarRequest {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="", Order=0)]
        public int a;
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="", Order=1)]
        public int b;
        
        public sumarRequest() {
        }
        
        public sumarRequest(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    [System.ServiceModel.MessageContractAttribute(WrapperName="sumarResponse", WrapperNamespace="http://Operaciones/", IsWrapped=true)]
    public partial class sumarResponse {
        
        [System.ServiceModel.MessageBodyMemberAttribute(Namespace="", Order=0)]
        public int @return;
        
        public sumarResponse() {
        }
        
        public sumarResponse(int @return) {
            this.@return = @return;
        }
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface OperacionesChannel : Sumas.OperacionesJava.Operaciones, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class OperacionesClient : System.ServiceModel.ClientBase<Sumas.OperacionesJava.Operaciones>, Sumas.OperacionesJava.Operaciones {
        
        public OperacionesClient() {
        }
        
        public OperacionesClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public OperacionesClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public OperacionesClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public OperacionesClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        Sumas.OperacionesJava.sumarResponse Sumas.OperacionesJava.Operaciones.sumar(Sumas.OperacionesJava.sumarRequest request) {
            return base.Channel.sumar(request);
        }
        
        public int sumar(int a, int b) {
            Sumas.OperacionesJava.sumarRequest inValue = new Sumas.OperacionesJava.sumarRequest();
            inValue.a = a;
            inValue.b = b;
            Sumas.OperacionesJava.sumarResponse retVal = ((Sumas.OperacionesJava.Operaciones)(this)).sumar(inValue);
            return retVal.@return;
        }
        
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
        System.Threading.Tasks.Task<Sumas.OperacionesJava.sumarResponse> Sumas.OperacionesJava.Operaciones.sumarAsync(Sumas.OperacionesJava.sumarRequest request) {
            return base.Channel.sumarAsync(request);
        }
        
        public System.Threading.Tasks.Task<Sumas.OperacionesJava.sumarResponse> sumarAsync(int a, int b) {
            Sumas.OperacionesJava.sumarRequest inValue = new Sumas.OperacionesJava.sumarRequest();
            inValue.a = a;
            inValue.b = b;
            return ((Sumas.OperacionesJava.Operaciones)(this)).sumarAsync(inValue);
        }
    }
}