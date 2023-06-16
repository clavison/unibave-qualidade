package br.com.unibave.state.headphone.after.states;

import br.com.unibave.state.headphone.after.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
