package br.com.atmconsultoria.ui.site;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.atmconsultoria.R;
import mehdi.sakout.aboutpage.AboutPage;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SiteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SiteFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SiteFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContatoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SiteFragment newInstance(String param1, String param2) {
        SiteFragment fragment = new SiteFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(getString(R.string.nossa_missao))
                .addGroup("Acesse nosso site")
                .addWebsite("https://uol.com.br", "uol.com.br")
                .create();

    }
}