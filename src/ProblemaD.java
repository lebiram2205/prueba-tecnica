import java.util.LinkedHashMap;
import java.util.Map;

public class ProblemaD {
	/**
	 * Metodo que determina si un caracter es permitido o no.
	 * @param _cultivo Es el caracter a evaluar
	 * @return true si el caracter es valido, false en otro caso.
	 */
	public boolean isValid(char _cultivo) {
		boolean isValid, isAsterisc = false;
		isAsterisc = (int)_cultivo == 42;
		
		if( Character.isLowerCase(_cultivo) || isAsterisc) {
			isValid = true;
		} else {
			isValid = false;
		}
		
		return isValid;
	}
	/**
	 * Utilice un map ya que con esto evito tener elementos duplicados,
	 * y de esta forma puedo contabilizar todos los cultivos diferentes con
	 * la seguridad de que son unicos.
	 * 
	 * **/
	public Map<Character, Integer> determinaCultivos(String _cultivos, String _poblacion){
		String cultivos = _cultivos;
		boolean isExpresionValid = false;
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		try {
			
			for(char c : cultivos.toCharArray()){
				isExpresionValid = isValid(c);
				
				if( isExpresionValid ) {
					if(map.containsKey(c)) {
				        map.put(c, map.get(c) + 1);
				    } else {
				        map.put(c, 1);
				    }
				}
			}
			System.out.println("");
			System.out.println("POBLACION :" + _poblacion);
			System.out.println("TIPOS DE CULTIVOS : " + (map.containsKey('*') ? (map.size() - 1) : map.size()));
			System.out.println("DESCONOCIDOS: " + map.get('*'));
			System.out.println("CANTIDADES : "+ map);
			System.out.println("");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
}
