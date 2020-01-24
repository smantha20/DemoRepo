package org.studyeasy.shop;
 

public class Door {
	private Lock lock = new Lock(){
			@Override
			public boolean isUnlocked(String keyCode) {
				if(keyCode.equals("qwerty")){
					return true;
				}else{
					return false;
				}
			}
			
		};

	public Lock getLock() {
		return lock;
	}
		
		
}
	 
	/*public class Door {
		public boolean isLocked(String key){
			class Lock{
				public boolean isLocked(String key){
					if(key.equals("qwerty")){
						return false;
					}else{
						return true;
					}
				}
			}
			return new Lock().isLocked(key);
		}

	}*/
 
 
 