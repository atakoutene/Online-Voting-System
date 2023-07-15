import {
  Component,
  ElementRef,
  OnInit,
  Renderer2,
  ViewChild,
} from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { NavigationService } from 'src/app/core/services/navigation.service';

class ImageSnippet {
  constructor(public src: string, public file: File) {}
}

@Component({
  selector: 'app-add-candidate',
  templateUrl: './add-candidate.component.html',
  styleUrls: ['./add-candidate.component.scss'],
})
export class AddCandidateComponent implements OnInit {
  addCandidateForm: FormGroup;
  selectedFile: ImageSnippet | undefined;
  @ViewChild('cameraPlaceholder')
  cameraPlaceholder!: ElementRef<HTMLDivElement>;

  constructor(
    private fb: FormBuilder,
    private navigationService: NavigationService,
    private route: ActivatedRoute,
    private renderer: Renderer2
  ) {
    this.addCandidateForm = this.fb.group({
      name: [''],
      email: [''],
      phone: [''],
      candidateID: [''],
      candidateKey: [''],
      candidatePicture: [''],
    });
  }

  ngOnInit(): void {}

  onSubmit() {
    console.log(this.addCandidateForm.value);
  }

  processFile(imageInput: any) {
    const file: File = imageInput.files[0];
    const reader = new FileReader();

    reader.addEventListener('load', (event: any) => {
      this.selectedFile = new ImageSnippet(event.target.result, file);
      this.renderer.setStyle(
        this.cameraPlaceholder.nativeElement,
        'opacity',
        0
      );
      /*  this.imageService.uploadImage(this.selectedFile.file).subscribe(
        (res) => {},
        (err) => {}
      ); */
    });

    reader.readAsDataURL(file);
  }
}
